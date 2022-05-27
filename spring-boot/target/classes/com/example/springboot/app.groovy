@RestController
class ThisWillActuallyRun {

    @GetMapping("/")
    String home() {
        return "Luce is the best!"
    }

}