fun main() {
        val cinemark = Cinema("Cinemark", 12, 21)

        println("Hello, be welcome to Cinemark")

        if (
            cinemark.addANewMovie(
                Movie(
                    nameMovie = "Enchanted",
                    gender = "Comedy, Fantasy e Animation",
                    releaseYear = 2021,
                )
            )
        )
            if (
                cinemark.addANewMovie(
                    Movie(
                        nameMovie = "Raya and the last dragon",
                        gender = "Action, Adventure e Animation",
                        releaseYear = 2021
                    )
                )
            )

                println("We got this movies available: ")

        val movie = cinemark.listAllTheMovies()
        val numberOfMovie = movie.size - 1
        for (index in 0..numberOfMovie) {
            println("\nName: ${movie[index].nameMovie}\nGenders: ${movie[index].gender}\nReleased: ${movie[index].releaseYear}")
        }
        println("\n what movie you wanna watch?\n1 - Enchanted\n2 - Raya and the last dragon")
        val choose = readLine()!!.toInt()

        if (choose == 1){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 1,
                    occupied = "No"
                )
            )
        } else if (choose == 2){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 1,
                    occupied = "Yes"
                )
            )
        } else {
            println("Choice Invalid")
        }

        if (choose == 1){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 2,
                    occupied = "No"
                )
            )
        } else if (choose == 2){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 2,
                    occupied = "Yes"
                )
            )
        }

        if (choose == 1){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 3,
                    occupied = "Yes"
                )
            )
        } else if (choose == 2){
            cinemark.registerSeat(
                Seat(
                    seatNumber = 3,
                    occupied = "Não"
                )
            )
        }


        println("Seats Available:")
        val seat = cinemark.listSeats()
        val numberSeat = seat.size - 1
        for (index in 0..numberSeat) {
            println("\nSeat: ${seat[index].seatNumber}\nIts Occupied: ${seat[index].occupied}")
        }

        println("What's your name?")
        val allName = readLine()!!.toString()

        println("\nWhich seat you wll want ${allName}?\nDigit 1 for the first seat\nDigit 2 for the second seat \nDigit 3 for the third seat ")

        val occupied = readLine()!!.toInt()

        if(choose == 1 && occupied == 3){
            println("This seat is already occupied")
        } else if (choose == 2 && occupied == 2 ||
            choose == 2 && occupied == 3){
            println("this seat is already occupied")
        }

        val ticketPrice = 32
        val halfPrice = 2
        val rate = 4.48

        println("\nDo you fit in some of this alternatives?\n1 - Student\n2 - Teacher\n3 - Old\n4 - None")
        val totalValue = when (readLine()!!.toInt()){
            1 -> println("The value is: ${(ticketPrice / halfPrice) + rate}")
            2 -> println("The value is: ${(ticketPrice / halfPrice)+ rate}")
            3 -> println("The value is: ${(ticketPrice / halfPrice)+ rate}")
            else -> println("The value is: 36,48")
        }

        println("Mr/Mrs ${allName}, wish finish the purchase of a ticket in the price of: ${totalValue}\n1 - yes\n2 - no")
        val end = readLine()!!.toInt()

        if (end == 1){
            println("have a good movie")
        } else if(end == 2){
            println("until the one then...")
        }

    }
