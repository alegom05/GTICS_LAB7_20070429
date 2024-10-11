package com.example.clase7gtics.controller;

import com.example.clase7gtics.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sala")
public class SalaController {



    @Autowired
    FuncionRepository funcionRepository;
    @Autowired
    SalaRepository salaRepository;

    @GetMapping(value = {"", "/"})
    public String listaFunciones(Model model) {
        model.addAttribute("listaSalas", salaRepository.findAll());
        return "sala/list";
    }
    /*
    @GetMapping("/new")
    public String nuevoProductoFrm(Model model, @ModelAttribute("product") Product product) {
        model.addAttribute("listaCategorias", categoryRepository.findAll());
        model.addAttribute("listaProveedores", supplierRepository.findAll());
        return "product/editFrm";
    }

    @PostMapping("/save")
    public String guardarProducto(@ModelAttribute("product") @Valid Product product, BindingResult bindingResult,
                                  RedirectAttributes attr, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("listaCategorias", categoryRepository.findAll());
            model.addAttribute("listaProveedores", supplierRepository.findAll());
            return "product/editFrm";
        } else {

            if (product.getId() == 0) {
                attr.addFlashAttribute("msg", "Producto creado exitosamente");
            } else {
                attr.addFlashAttribute("msg", "Producto actualizado exitosamente");
            }
            productRepository.save(product);
            return "redirect:/product";
        }
    }

    @GetMapping("/edit")
    public String editarTransportista(Model model, @RequestParam("id") int id,
                                      @ModelAttribute("product") Product product) {

        Optional<Product> optProduct = productRepository.findById(id);

        if (optProduct.isPresent()) {
            product = optProduct.get();
            model.addAttribute("product", product);
            model.addAttribute("listaCategorias", categoryRepository.findAll());
            model.addAttribute("listaProveedores", supplierRepository.findAll());
            return "product/editFrm";
        } else {
            return "redirect:/product";
        }
    }

    @GetMapping("/delete")
    public String borrarTransportista(Model model,
                                      @RequestParam("id") int id,
                                      RedirectAttributes attr) {

        Optional<Product> optProduct = productRepository.findById(id);

        if (optProduct.isPresent()) {
            productRepository.deleteById(id);
            attr.addFlashAttribute("msg", "Producto borrado exitosamente");
        }
        return "redirect:/product";

    }
    */
}
