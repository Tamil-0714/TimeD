const mysql = require("mysql2");

const connectDB = async () => {
  const pool = mysql.createPool({
    host: "toojoo-1967-toojoo-07.a.aivencloud.com",
    port:13926,
    user: "avnadmin",
    password: "AVNS_l-E-H4HrPWaBiXrwoYe",
    database: "peoples",
    waitForConnections: true,
    connectionLimit: 20,
  });
  return pool.promise();
};
async function queryDB(query) {
  try {
    const connection = await connectDB();
    const [rows] = await connection.query(query);
    connection.releaseConnection();
    return rows;
  } catch (error) {
    console.error(error);
  }
}

async function insertData(name, age, contact) {
  try {
    return await queryDB(
      `insert into persons(name,age,contact) values('${name}', ${age}, ${contact})`
    );
  } catch (error) {
    console.error(error);
  }
}

module.exports = {
  insertData,
};
