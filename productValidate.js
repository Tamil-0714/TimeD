document.querySelectorAll("#registerForm").addEventListener("click", (e) => {
  e.preventDefault();
  const productName = document.getElementById("productName").value.trim();
  const productCate = document.getElementById("productCate").value.trim();
  const productId = document.getElementById("productId").value.trim();
  const price = document.getElementById("price").value.trim();
  const discount = document.getElementById("discount").value.trim();
  if (!productName && !productCate && !productId && !price && !discount) {
    alert("Every fields should be filled");
  }
  
  if (!productName) {
    alert("Fill the productName field");
    return;
  }
  if (!productCate) {
    alert("Fill the productCategory field");
    return;
  }
  if (!productId) {
    alert("Fill the productId field");
    return;
  }
  if (!price) {
    alert("Fill the price field");
    return;
  }
  if (!discount) {
    alert("Fill the discount field");
    return;
  }

});
