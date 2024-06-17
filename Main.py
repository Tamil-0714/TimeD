import os
import pandas as pd
from datetime import datetime
from tabulate import tabulate


def get_formated_dateTime():
    now = datetime.now()
    formatted_date_time = now.strftime('%d-%m-%Y/%H:%M')
    return formatted_date_time



def new_entry():
    id = int(input("Enter the id for this Customer : "))
    name = input("Enter the name of this Customer : ")
    dateTime = get_formated_dateTime()
    gold_in_gram = int(input("Enter the amount of gold in grams : "))
    amount_settled = int(input("Enter the settled amount in rupess : "))
    due_date = int(input("Enter the due date in format of DD : "))
    collected_actual_amount = 0
    collected_intrest_amount = 0
    balance_amount = amount_settled
    
    row = [id,
           name,
           dateTime,
           gold_in_gram,
           amount_settled,
           due_date,
           collected_actual_amount,
           collected_intrest_amount,
           balance_amount
        ]
    column_headings = ['id',
                       'name',
                       'dateTime',
                       'gold in gram',
                       'amount settled',
                       'due date',
                       'collected actual amount',
                       'collected intrest amount',
                       'balance amount'
                    ]
    
    file_path = 'customer_data.xlsx'
    if os.path.exists(file_path):
        df = pd.read_excel(file_path)
    else:
        df = pd.DataFrame()
    # df = pd.DataFrame([row], columns=column_headings)
    new_data = pd.DataFrame([row], columns=column_headings)
    if df.empty:
        df = new_data
    else:
        df = pd.concat([df, new_data], ignore_index=True)

    df.to_excel(file_path, index=False)

def balance_update():
    file_path = 'customer_data.xlsx'
    if os.path.exists(file_path):
        df = pd.read_excel(file_path)
    else:
        raise FileNotFoundError(f"The file {file_path} does not exist.")
        
    unique_id = int(input("Enter the Id of the Customer : "))
    actual_amount_column = 'collected actual amount'
    intrest_amount_column = 'collected intrest amount'
    amount = int(input("Enter the Paid amount in rupess : "))
    actual_amount = amount * 0.95
    intrest_amount = amount * 0.05
    
    if unique_id in df['id'].values:
        old_actual_amount = df.loc[df['id'] == unique_id, actual_amount_column].values[0]
        df.loc[df['id'] == unique_id, actual_amount_column] = actual_amount + old_actual_amount
        old_intrest_amount = df.loc[df['id'] == unique_id, intrest_amount_column].values[0]
        df.loc[df['id'] == unique_id, intrest_amount_column] = intrest_amount+old_intrest_amount
        old_balance = df.loc[df['id'] == unique_id, 'balance amount'].values[0]
        balance_amount = old_balance - actual_amount
        df.loc[df['id'] == unique_id, 'balance amount'] = balance_amount
    else:
        raise ValueError(f"The ID {unique_id} does not exist in the DataFrame.")

    df.to_excel(file_path, index=False)
    
def single_user():
    file_path = 'customer_data.xlsx'
    if os.path.exists(file_path):
        df = pd.read_excel(file_path)
    else:
        raise FileNotFoundError(f"The file {file_path} does not exist.")
    unique_id = int(input("Enter the id to display the user data"))
    if unique_id in df['id'].values:
        row = df.loc[df['id'] == unique_id]
        print("The row for ID {} is:".format(unique_id))
        print(tabulate(row, headers='keys', tablefmt='psql', showindex=False))
    else:
        raise ValueError(f"The ID {unique_id} does not exist in the DataFrame.")
    
def all_users():
    file_path = 'customer_data.xlsx'
    if os.path.exists(file_path):
        df = pd.read_excel(file_path)
    else:
        raise FileNotFoundError(f"The file {file_path} does not exist.")
    print(tabulate(df, headers='keys', tablefmt='psql', showindex=False))
    
while True:
    print('\n\n----------------Gold Pledge Shop Data Entry----------------')
    print('Choose the options below')
    print('1. Enter a new customer data')
    print('2. view all existing customer data')
    print('3. view an existing customer data with theri id')
    print('4. Update balance sheet for an existing customer data with theri id')
    print('0. To exit the App')
    option = int(input('Enter the option : '))
    if option == 1:
        new_entry()
    elif option == 2:
        all_users()
    elif option == 3:
        single_user()
    elif option == 4:
        balance_update()
    elif option == 0:
        break
    else:
        print("Invalid Options")
        
    