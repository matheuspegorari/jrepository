package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Ligacao implements SankhyaEntity<Ligacao> {

   private String alterar;
   private String condicao;
   private String excluir;
   private String expressao;
   private String inserir;
   private String nomeLigacao;
   private BigDecimal nuInstDest;
   private BigDecimal nuInstOrig;
   private String obrigatoria;
   private String tipLigacao;

   public String getAlterar() {
        return alterar;
   }

   public void setAlterar(String alterar) {
        this.alterar = alterar;
   }

   public String getCondicao() {
        return condicao;
   }

   public void setCondicao(String condicao) {
        this.condicao = condicao;
   }

   public String getExcluir() {
        return excluir;
   }

   public void setExcluir(String excluir) {
        this.excluir = excluir;
   }

   public String getExpressao() {
        return expressao;
   }

   public void setExpressao(String expressao) {
        this.expressao = expressao;
   }

   public String getInserir() {
        return inserir;
   }

   public void setInserir(String inserir) {
        this.inserir = inserir;
   }

   public String getNomeLigacao() {
        return nomeLigacao;
   }

   public void setNomeLigacao(String nomeLigacao) {
        this.nomeLigacao = nomeLigacao;
   }

   public BigDecimal getNuInstDest() {
        return nuInstDest;
   }

   public void setNuInstDest(BigDecimal nuInstDest) {
        this.nuInstDest = nuInstDest;
   }

   public BigDecimal getNuInstOrig() {
        return nuInstOrig;
   }

   public void setNuInstOrig(BigDecimal nuInstOrig) {
        this.nuInstOrig = nuInstOrig;
   }

   public String getObrigatoria() {
        return obrigatoria;
   }

   public void setObrigatoria(String obrigatoria) {
        this.obrigatoria = obrigatoria;
   }

   public String getTipLigacao() {
        return tipLigacao;
   }

   public void setTipLigacao(String tipLigacao) {
        this.tipLigacao = tipLigacao;
   }

   @Override
   public String getEntityName() {
        return "Ligacao";
   }

   @Override
   public Ligacao fromVO(DynamicVO vo) {
        this.alterar = vo.asString("ALTERAR");
        this.condicao = vo.asString("CONDICAO");
        this.excluir = vo.asString("EXCLUIR");
        this.expressao = vo.asString("EXPRESSAO");
        this.inserir = vo.asString("INSERIR");
        this.nomeLigacao = vo.asString("NOMELIGACAO");
        this.nuInstDest = vo.asBigDecimal("NUINSTDEST");
        this.nuInstOrig = vo.asBigDecimal("NUINSTORIG");
        this.obrigatoria = vo.asString("OBRIGATORIA");
        this.tipLigacao = vo.asString("TIPLIGACAO");
        return this;
   }
}
