const Employee = require('./Employee');

class Staff extends Employee {
    constructor(name, address, phoneNumber, email, office, salary, hireDate, title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }
}

module.exports = Staff;