const Staff = require('./Staff');

class PartTime extends Staff {
    constructor(name, address, phoneNumber, email, office, hourlyRate, hireDate, title, hoursWorked) {
        super(name, address, phoneNumber, email, office, 0, hireDate, title);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.calculateSalary();
    }

    calculateSalary() {
        this.salary = this.hourlyRate * this.hoursWorked;
    }
}

module.exports = PartTime;