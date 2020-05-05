// 1) replace the list items' content with items from this list:
//     ['apple', 'banana', 'cat', 'dog']
var list = document.getElementsByTagName("li");
list[0].innerHTML = "apple";
list[1].innerHTML = "banana";
list[2].innerHTML = "cat";
list[3].innerHTML = "dog";

// 2) change the <ul> element's background color to 'limegreen'
// - use css class to change the color instead of the style property
