package br.com.claudioazevedojr.todolist.user;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*modificador
*public
*private
*protected

 */
@RestController
@RequestMapping("/users")
public class UserController {


    /**
*string(texto)
*integer(int) numeros inteiros
*Double(double) numeros com casas decimal de 0.000
*char(A,C) character
*Date(Data)
*void(sem retorno)
*

 */
    @postmapping("/")
    public void create(@RequestBody userModel usermModel) {
        system.out.println(userModel.name);
}
