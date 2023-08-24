const Employee = require('./Employee');

class Faculty extends Employee {
    constructor(name, address, phoneNumber, email, office, salary, hireDate, officeHours, rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }
}

module.exports = Faculty;