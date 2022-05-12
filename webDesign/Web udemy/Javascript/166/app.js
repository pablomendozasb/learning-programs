
const password = prompt("please enter a new password");


//password must be 6+ characters
if (password.length >= 6) {
    console.log("long enough password!");
}
else {
    console.log("password too short! Must be 6+ characters");
}
//password cannot include space

if (password.indexOf(' ') === -1) {
    console.log("Good job! No space!");
}

else {
    console.log("Password cannot contain spaces!");
}
