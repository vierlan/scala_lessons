/**
 * If else
 */

// Depending on the weather, tell me what to wear.

val weather: String = "Hot"

if (weather == "cold") {
  s"It is $weather, t-shirt and shorts day!!"
} else {
  s"You need a coat, it isn't $weather"
}

// if true --> hits the first block in the if statement
// if false --> hits the second block in the if statement

if (weather.toLowerCase == "hot") {
  s"It is $weather, t-shirt and shorts day!!"
} else if (weather == "raining") {
  s"It is $weather, take a coat with a hood"
} else {
  s"$weather is not valid.  Please enter raining or hot!"
}

//multiple options

val season: String = "winter"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  s"It is $weather, take a coat"
} else {
  "A light jacket is fine!"
}

val score: Int = 76

if (score > 100) {
  s"You cannot enter a number higher than 100 for score percentage!"
} else if (score >=90) {
  s"You scored $score% Your grade is A "
} else if (score >=80) {
  s"You scored $score% Your grade is B "
} else if (score >=70) {
  s"You scored $score% Your grade is C "
} else if (score >=60) {
  s"You scored $score% Your grade is D "
} else if (score >=50) {
  s"You scored $score% Your grade is E "
} else if (score < 50 && score >= 0) {
  s"You scored $score% Your grade is F "
} else {
  "Not a valid score.  Please enter a number between 1 and 100"
}

val ageForCinema: Int = -8

if (ageForCinema >= 18) {
  s"Yoc can watch any film at the age of $ageForCinema years old"
} else if (ageForCinema >= 15) {
  s"You can watch any film, except 18+ films at $ageForCinema years old"
} else if (ageForCinema >= 15) {
  s"You can watch any film, except 18+ films at $ageForCinema years old"
} else if (ageForCinema >= 12) {
  s"You can watch any film, except 18+ and 15+ films at $ageForCinema years old"
 } else if (ageForCinema >= 8) {
  s"You can watch 'U' and 'PG' rated films at $ageForCinema years old"
} else if (ageForCinema >= 4) {
  s"You can watch PG' rated films at $ageForCinema years old"
} else if (ageForCinema <4 && ageForCinema >= 0 ) {
  s"You cannot watch any films at $ageForCinema years old"
} else {
  "Please enter a valid age"
}



