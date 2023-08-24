
class MyDate {
    constructor(year, month, day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    toString() {
        return `${this.month}/${this.day}/${this.year}`;
    }
}

module.exports = MyDate;
