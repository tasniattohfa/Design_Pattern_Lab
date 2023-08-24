const Person = require('./Person');

class Employee extends Person {
    constructor(name, address, phoneNumber, email, office, salary, hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }
}

module.exports = Employee;