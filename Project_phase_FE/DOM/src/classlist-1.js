// If the fourth p has a 'dolphin' class, replace apple's content with 'pear'
const p = document.getElementsByTagName("p");
const apple = document.getElementsByClassName("apple");
if (p[3].getAttribute("dolphin") != null){
    apple[0].textContent = "pear";
}

// If the first p has an 'apple' class, replace cat's content with 'dog'
if (p[0].getAttribute("class") === "apple"){
    p[2].textContent = "dog";
}
// Make apple red by adding a .red class
p[0].className = "red"

// Make balloon less balloon-like (change its shape)
