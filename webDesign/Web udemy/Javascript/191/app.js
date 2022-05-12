
// for (let num = 1; num <= 10; num+= 1) {
//     console.log("I am in the loop body:");
//     console.log(num);
// }

// for (let i = 1; i<= 20; i+=2) {
//     console.log(i);
// }

// for (let i = 100; i >= 0; i-= 10) {
//     console.log(i);
// }

// for (let i = 10; i <= 1000; i*= 10){
//     console.log(i);
// }

// const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"]; //DONT TOUCH THIS LINE!

// // WRITE YOUR LOOP BELOW THIS LINE:
// for (let i = 0; i < people.length; i++) {
//     console.log(people[i].toUpperCase());
// }

// for (let i = 1; i <= 10; i++) {
//     console.log(`i is: ${i}`);
//     for (let j = 1; j < 4; j++) {
//         console.log(`   j is: ${j}`);
//     }
// }

const seatingChart = [
    ['Kristen', 'Erik', 'Namita'],
    ['Geoffrey', 'Juanita', 'Antonio', 'Kevin'],
    ['Yuma', 'Sakura', 'Jack', 'Erika']
]

for (let i = 0; i < seatingChart.length; i++) {
    const row = seatingChart[i];
    console.log (`ROW #${i+1}`);
    for (let j = 0; j < row.length; j++) {
        console.log(row[j]);
    }
}