package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.webapi.PokeBuildApi;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

class BagarreTest {

    @Test
    void fail_when_pokemon_is_not_valid_in_api(){
        var fausseApi = Mockito.mock(PokeBuildApi.class) ;
        Mockito.when(fausseApi.recupererParNom("pikachu"))
                .thenReturn(CompletableFuture.completedFuture(new Pokemon("pikachu", "url1", new Stats(1, 2))));

    }
    

}