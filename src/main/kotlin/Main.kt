package racingcar.domain

fun main() {
    val car = Car("name", 2)
    car.move()

    println(car.name)
    println(car.position)
}
