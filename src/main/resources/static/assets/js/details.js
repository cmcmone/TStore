function minus() {
  let quantity = document.getElementById("quantity-value");
  if (quantity.value > 0)
    quantity.value--;
  document.getElementById("quantity-value").value = quantity.value;
}

function plus() {
  let quantity = document.getElementById("quantity-value");
  document.getElementById("quantity-value").value = parseInt(quantity.value) + 1;
}