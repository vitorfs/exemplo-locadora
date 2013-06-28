/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufjf.model;

import java.util.List;

/**
 *
 * @author vitorfs
 */
public class Filme {
    private Integer id;
    private String tituloOriginal;
    private String tituloPortugues;
    private String pais;
    private String ano;
    private String direcao;
    private String elenco;
    private String sinopse;
    private List<Genero> genero;
    private Audio audio;
    private List<Legenda> legenda;
    private Distribuidora distribuidora;
}