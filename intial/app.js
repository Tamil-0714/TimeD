const express = require("express");
const app = express();
const db = require("./models/DB.js");

app.use(express.json());
app.use(express.static("public"));
app.use(express.urlencoded({ extended: true }));


app.post("/usrdata", (req, res) => {
  const data = req.body;
  console.log(data);
  db.insertData(data.name, data.age, data.contact);
  res.send("fine");
});

app.listen(7080, () => {
  console.log(`app running on http://localhost:7080`);
});
