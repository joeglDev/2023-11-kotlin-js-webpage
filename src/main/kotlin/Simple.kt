import kotlinx.browser.document
import org.w3c.dom.HTMLButtonElement
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLSpanElement
import org.w3c.dom.events.MouseEvent

fun main() {
    var count = 0
    val countElement = document.createElement("span") as HTMLSpanElement
    val buttonElement = document.createElement("button") as HTMLButtonElement
    val containerElement = document.createElement("div") as HTMLDivElement

    countElement.textContent = count.toString()
    buttonElement.textContent = "Increment"
    buttonElement.onclick = fun (_:MouseEvent)  {
        count += 1
        countElement.textContent = count.toString()
    }

    containerElement.append(countElement, buttonElement)
    document.body?.append(containerElement)
}
