package com.example.Taller.book.Controller;

import com.example.Taller.book.Model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// Define la ruta base de este controlador: todas las URLs que empiecen con
@RequestMapping("/books")

public class BookController {
    @GetMapping("/{title}/{author}/{year}")

    public String showUser(@PathVariable String title, @PathVariable String author, @PathVariable int year, Model model) {
        // Crea un nuevo objeto User con el nombre proporcionado

        Book book = new Book(title, author, year);

        model.addAttribute("book", book);

        // Retorna el nombre de la vista (user.html) para mostrar los datos
        return "book";  // La vista se ubicará en src/main/resources/templates/book.html
}
}