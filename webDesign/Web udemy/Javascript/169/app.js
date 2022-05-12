
const userInput = prompt ("Enter something");

if (userInput ) {
    console.log("Truthy!");
}

else {
    console.log("Falsy! ");
}

if (undefined) {
    console.log("Truthy");
}
else{
    console.log("Falsy")
}

if (1) {
    console.log("Truthy");
}

else {
    console.log("False");
}