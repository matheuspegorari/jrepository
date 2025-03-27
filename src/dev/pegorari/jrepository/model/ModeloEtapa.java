package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModeloEtapa extends AbstractSankhyaEntity<ModeloEtapa> {
   public BigDecimal getCodMetod() {
        return this.getVo().asBigDecimal("CODMETOD");
   }

   public void setCodMetod(BigDecimal codMetod) {
        markAsChanged("CODMETOD", codMetod);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getExigeProdutos() {
        return this.getVo().asString("EXIGEPRODUTOS");
   }

   public void setExigeProdutos(String exigeProdutos) {
        markAsChanged("EXIGEPRODUTOS", exigeProdutos);
   }

   public BigDecimal getNumModelo() {
        return this.getVo().asBigDecimal("NUMMODELO");
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
   }

   public BigDecimal getNumModeloPai() {
        return this.getVo().asBigDecimal("NUMMODELOPAI");
   }

   public void setNumModeloPai(BigDecimal numModeloPai) {
        markAsChanged("NUMMODELOPAI", numModeloPai);
   }

   public BigDecimal getNumSeq() {
        return this.getVo().asBigDecimal("NUMSEQ");
   }

   public void setNumSeq(BigDecimal numSeq) {
        markAsChanged("NUMSEQ", numSeq);
   }

   public String getObrigatoria() {
        return this.getVo().asString("OBRIGATORIA");
   }

   public void setObrigatoria(String obrigatoria) {
        markAsChanged("OBRIGATORIA", obrigatoria);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getTipValor() {
        return this.getVo().asString("TIPVALOR");
   }

   public void setTipValor(String tipValor) {
        markAsChanged("TIPVALOR", tipValor);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getVlrSuplementa() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTA");
   }

   public void setVlrSuplementa(BigDecimal vlrSuplementa) {
        markAsChanged("VLRSUPLEMENTA", vlrSuplementa);
   }

   public BigDecimal getVlrSuplementado() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTADO");
   }

   public void setVlrSuplementado(BigDecimal vlrSuplementado) {
        markAsChanged("VLRSUPLEMENTADO", vlrSuplementado);
   }

   public String getSuplementa() {
        return this.getVo().asString("SUPLEMENTA");
   }

   public void setSuplementa(String suplementa) {
        markAsChanged("SUPLEMENTA", suplementa);
   }

   public String getSuplementado() {
        return this.getVo().asString("SUPLEMENTADO");
   }

   public void setSuplementado(String suplementado) {
        markAsChanged("SUPLEMENTADO", suplementado);
   }

   @Override
   public String getTableName() {
        return "TCSMOD";
   }

   @Override
   public String getEntityName() {
        return "ModeloEtapa";
   }

   @Override
   public ModeloEtapa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
