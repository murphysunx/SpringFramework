import com.apress.isf.java.model.Document
import com.apress.isf.java.model.Type
import com.apress.isf.spring.data.DocumentRepository
import com.apress.isf.spring.service.SearchEngineService

beans {

    engine(SearchEngineService){
        documentDao = ref("documentDAO")
    }

    documentDao (DocumentRepository) {
        doc1 = ref("doc1")
        doc2 = ref("doc2")
        doc3 = ref("doc3")
        doc4 = ref("doc4")
    }

    doc1(Document) {
        name = "Book Template"
        type = ref("pdfType")
        location = "/Users/felipeg/Documents/Random/Book Template.pdf"
    }

    doc2(Document) {
        name = "Sample Contract"
        type = ref("pdfType")
        location = "/Users/felipeg/Documents/Random/Sample Contract.pdf"
    }

    doc3(Document) {
        name = "Clustering With RabbitMO"
        type = ref("noteType")
        location = "/Users/felipeg/Documents/Random/Clustering With RabbitMO.text"
    }

    doc4(Document) {
        name = "Pro Spring Security Book"
        type = ref("webType")
        location = "http://www.apress.com/9781430248187"
    }

    webType(Type) {
        name = "WEB"
        desc = "Web Link"
        extension = ".url"
    }

    pdfType(Type) {
        name = "PDF"
        desc = "Poratable Document Format"
        extension = ".url"
    }

    noteType(Type) {
        name = "NOTE"
        desc = "Text Notes"
        extension = ".txt"
    }
}
