package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MultiplasDatasEntrega extends AbstractSankhyaEntity<MultiplasDatasEntrega> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getQtdEntrega() {
        return this.getVo().asBigDecimal("QTDENTREGA");
   }

   public void setQtdEntrega(BigDecimal qtdEntrega) {
        markAsChanged("QTDENTREGA", qtdEntrega);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCabecalho() {
        return this.getVo().asString("CABECALHO");
   }

   public void setCabecalho(String cabecalho) {
        markAsChanged("CABECALHO", cabecalho);
   }

   public Timestamp getDataEntrega() {
        return this.getVo().asTimestamp("DATAENTREGA");
   }

   public void setDataEntrega(Timestamp dataEntrega) {
        markAsChanged("DATAENTREGA", dataEntrega);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getDiferenciador() {
        return this.getVo().asBigDecimal("DIFERENCIADOR");
   }

   public void setDiferenciador(BigDecimal diferenciador) {
        markAsChanged("DIFERENCIADOR", diferenciador);
   }

   public BigDecimal getNumCotacao() {
        return this.getVo().asBigDecimal("NUMCOTACAO");
   }

   public void setNumCotacao(BigDecimal numCotacao) {
        markAsChanged("NUMCOTACAO", numCotacao);
   }

   @Override
   public String getTableName() {
        return "TGFMDE";
   }

   @Override
   public String getEntityName() {
        return "MultiplasDatasEntrega";
   }

   @Override
   public MultiplasDatasEntrega fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
