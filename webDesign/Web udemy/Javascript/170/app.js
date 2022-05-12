// const password = prompt ("Enter your password");

// if (password.length >= 6 && password.indexOf(' ') === -1) {
//     console.log("VALID PASSWORD!");
// }

// else {
//     console.log("INCORRECT FORMAT FOR PASSWORD");
// }

// 0-5 free
// 5-10 $10
// 10-65 $20
// 65+ free

// const age = 1000;
// if (age >= 0 && age < 5 || age >= 65) {
//     console.log("FREE");
// }

// else if (age >=5 && age < 10) {
//     console.log("$10");
// }

// else if (age >= 10 && age < 65) {
//     console.log("$20");
// }

// else {
//     console.log("Invalid age");
// }

// let firstName= prompt ("enter your first name");
// if (!firstName) {
//     firstName = prompt ("Try again!");
// }

const age = 8;
if (!(age >= 0 && age < 5 || age >= 65)) {
    console.log("You are not a senior or a baby.");
}