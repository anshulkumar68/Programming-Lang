/*CHALLENGE 1

1)Store Mark's and John's mass and height in variables called massMark, heightMark, massJohn and heightJohn.
2)Calculate both their BMIs using the formula, and store the results in two variables called BMIMark and BMIJohn.
3)Log the value of BMIMark and BMIJohn to the console.
4)BONUS: Create a boolean variable markHigherBMI containing information about whether Mark has a higher BMI than John. Log it to the console too

TEST DATA: Marks weighs 78 kg and is 1.69 m tall. John weighs 92 kg and is 1.95 m tall.*/
console.log("CHALLENGE 1 \n")
const massMark = 78;
const massJohn = 92;
const heightMark = 1.69;
const heightJohn = 1.95;

BMIMark = massMark / (heightMark * heightMark);
BMIJohn = massJohn / (heightJohn * heightJohn);

console.log("BMI of Mark " + BMIMark);
console.log("BMI of John " + BMIJohn);

const markHigherBMI = BMIMark > BMIJohn;
console.log(markHigherBMI);

/*CHALLENGE #2
Use the BMI example from Challenge #1, and the code you already wrote, and improve it:

1. Print a nice output to the console, telling the user who has the higher BMI. The message can be either:

"Mark's BMI is higher than John's!" or "John's BMI is higher than Mark's!".

2. Modify the outputs above to use template literals to include the BMI values in the outputs.

Example: "Mark's BMI (28.3) is higher than John's (23.9)!" or "John's BMI (29.1) is higher than Mark's (27)!".
console.log(`Mark BMI ${BMIMark} is higher than John's ${BMIJohn}`);*/
console.log("\n CHALLENGE 2 \n")
if (BMIMark > BMIJohn) {
    console.log(`Mark's BMI ${BMIMark} is higher than John's ${BMIJohn}`);
}
else {
    console.log(`John's BMI ${BMIJohn} is higher than Mark's ${BMIMark}`);
}

/*CHALLENGE #3
There are two gymnastics teams: Dolphins and Koalas. They compete against each other 3 times. The winner with the highest average score wins a trophy!

Your tasks:

1. Calculate the average score for each team, using the test data included below. The average score for Dolphins should be assigned to the scoreDolphins variable, and the average score of Koalas should be assigned to the scoreKoalas variable.

2. Compare the team's average scores to determine the winner of the competition, and print to the console:

"Dolphins win the trophy" if Dolphins win, or

"Koalas win the trophy" if Koalas win, or

"Both win the trophy" if their average scores are equal.

TEST DATA: Dolphins scored 96, 108, and 89. Koalas scored 88, 91, and 110.*/
console.log("\n CHALLENGE 3 \n")
scoreDolphins = (96 + 108 + 89) / 3;
scoreKoalas = (88 + 91 + 110) / 3;
console.log(scoreDolphins, scoreKoalas);

if (scoreDolphins > scoreKoalas) {
    console.log("Dolphins win the trophy");
}
else if (scoreDolphins < scoreKoalas) {
    console.log("Koalas win the trophy");
}
else {
    console.log("Both win the trophy");
}

/*CHALLENGE #4
Steven needs a very simple tip calculator for whenever he goes to eat in a restaurant. In his country, it's usual to tip 15% if the bill value is between 50 and 300. If the value is different, the tip is 20%.

Your tasks:

Calculate the tip, depending on the bill value. Create a variable called tip for this. It's not allowed to use an if...else statement (if it's easier for you, you can start with an if...else statement, and then try to convert it to a ternary operator).

Print a string to the console containing the bill value, the tip, and the final value (bill + tip).

Example: The bill was 275, the tip was 41.25, and the total value 316.25.

Note: Use the values of the bill and tip variables to construct this string. Don't hard-code them 🙂

TEST DATA: Test with different bill values: 275, 40, and 430*/
console.log("\n CHALLENGE 4 \n")

let bill = 40, tip;
// if (bill >= 50 && bill <= 300) {
//     tip = (15 * bill) / 100;
// }
// else {
//     tip = (20 * bill) / 100;
// }
(bill >= 50 && bill <= 300) ? tip = (15 * bill) / 100 : tip = (20 * bill) / 100;
console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${bill + tip}`);