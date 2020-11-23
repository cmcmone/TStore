function DropdownMenu() {
  var hideMenu = document.getElementById("categories-menu-bar-dropdown-detail");
  if (hideMenu != null) {
    if (hideMenu.style.display == "" || hideMenu.style.display == "none") {
      hideMenu.style.display = "block";
    } else {
      hideMenu.style.display = "none";
    }
  }
}

function hideDropdownMenu() {
  var hideMenu = document.getElementById("categories-menu-bar-dropdown-detail");
  if (hideMenu != null) {
    hideMenu.style.display = "none";
  }
}

function showDropdownMenu() {
  var hideMenu = document.getElementById("categories-menu-bar-dropdown-detail");
  if (hideMenu != null) {
    hideMenu.style.display = "block";
  }
}