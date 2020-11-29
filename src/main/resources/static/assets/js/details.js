function minus() {
  let quantity = document.getElementById("quantity-value");
  if (quantity.value > 1)
    quantity.value--;
  document.getElementById("quantity-value").value = quantity.value;
}

function plus() {
  let quantity = document.getElementById("quantity-value");
  document.getElementById("quantity-value").value = parseInt(quantity.value) + 1;
}