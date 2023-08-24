const MyDate = require('./MyDate');
const Student = require('./Student');
const Faculty = require('./Faculty');
const PartTime = require('./PartTime');
const FullTime = require('./FullTime');



// Create CustomDate instance
const myDate = new MyDate(2023, 8, 17);

// Create Student instance
const student = new Student("Tohfaaa", "IUT", "123-456-789", "tohfaaa@gmail.com", "senior");

// Create Faculty instance
const faculty = new Faculty("Sara", "DU", "987-654-3210", "sara@gmail.com", "A301", 60000, myDate, "Mon-Fri 9am-5pm", "Professor");

// Create PartTimeStaff instance
const partTimeStaff = new PartTime("Fariha", "Green Road,Dhaka", "555-123-4567", "fariha@egmail.com", "B102", 20, myDate, "Assistant", 25);

// Create FullTimeStaff
const fullTimeStaff = new FullTime(
    "Kabir Rayhan","Gulshan-2,Dhaka","555-987-6543","krayhan@yahoo.com","C202",80000,myDate,"Manager");

// Display the information
console.log(student.toString());
console.log(faculty.toString());
console.log(partTimeStaff.toString());

console.log(`Part-Time Staff Salary: $${partTimeStaff.salary}`);

console.log(`Salary: $${fullTimeStaff.salary}`);
