function myFunction () {

    //create an 'li' node:
    const node = document.createElement('li');
    
    //create a text node:
    const textNode = document.createTextNode ('Water');

    //Append the text node to the 'li' node:
    node.appendChild (textNode);

    //Append the 'li' node to the list:
    document.getElementById ("myList").appendChild(node);

}