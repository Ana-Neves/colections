class Cinema (
    private val name: String,
    private val openingHour: Byte,
    private val closingHour:Byte,
    ){
    private var seats = mutableListOf<Seat>()
    private var movies = mutableListOf<Movie>()

    fun addANewMovie(movie: Movie): Boolean = movies.add(movie)

    fun listAllTheMovies() = movies

    fun registerSeat(assento: Seat): Boolean = seats.add(assento)

    fun listSeats() = seats
}