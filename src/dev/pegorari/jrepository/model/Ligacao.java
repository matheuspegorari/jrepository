package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Ligacao extends AbstractSankhyaEntity<Ligacao> {
   public String getAlterar() {
        return this.getVo().asString("ALTERAR");
   }

   public void setAlterar(String alterar) {
        markAsChanged("ALTERAR", alterar);
   }

   public String getCondicao() {
        return this.getVo().asString("CONDICAO");
   }

   public void setCondicao(String condicao) {
        markAsChanged("CONDICAO", condicao);
   }

   public String getExcluir() {
        return this.getVo().asString("EXCLUIR");
   }

   public void setExcluir(String excluir) {
        markAsChanged("EXCLUIR", excluir);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public String getInserir() {
        return this.getVo().asString("INSERIR");
   }

   public void setInserir(String inserir) {
        markAsChanged("INSERIR", inserir);
   }

   public String getNomeLigacao() {
        return this.getVo().asString("NOMELIGACAO");
   }

   public void setNomeLigacao(String nomeLigacao) {
        markAsChanged("NOMELIGACAO", nomeLigacao);
   }

   public BigDecimal getNuInstDest() {
        return this.getVo().asBigDecimal("NUINSTDEST");
   }

   public void setNuInstDest(BigDecimal nuInstDest) {
        markAsChanged("NUINSTDEST", nuInstDest);
   }

   public BigDecimal getNuInstOrig() {
        return this.getVo().asBigDecimal("NUINSTORIG");
   }

   public void setNuInstOrig(BigDecimal nuInstOrig) {
        markAsChanged("NUINSTORIG", nuInstOrig);
   }

   public String getObrigatoria() {
        return this.getVo().asString("OBRIGATORIA");
   }

   public void setObrigatoria(String obrigatoria) {
        markAsChanged("OBRIGATORIA", obrigatoria);
   }

   public String getTipLigacao() {
        return this.getVo().asString("TIPLIGACAO");
   }

   public void setTipLigacao(String tipLigacao) {
        markAsChanged("TIPLIGACAO", tipLigacao);
   }

   @Override
   public String getTableName() {
        return "TDDLIG";
   }

   @Override
   public String getEntityName() {
        return "Ligacao";
   }

   @Override
   public Ligacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
