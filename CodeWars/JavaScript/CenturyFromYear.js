function century(year) {

    yearsCentury = (year % 100 == 0) ? (year / 100) : Math.trunc(((year / 100) + 1))

    return yearsCentury

  }
