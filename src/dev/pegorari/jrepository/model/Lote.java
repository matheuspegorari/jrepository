package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lote extends AbstractSankhyaEntity<Lote> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getData() {
        return this.getVo().asTimestamp("DATA");
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
   }

   public BigDecimal getInteiro() {
        return this.getVo().asBigDecimal("INTEIRO");
   }

   public void setInteiro(BigDecimal inteiro) {
        markAsChanged("INTEIRO", inteiro);
   }

   public String getLogico() {
        return this.getVo().asString("LOGICO");
   }

   public void setLogico(String logico) {
        markAsChanged("LOGICO", logico);
   }

   public BigDecimal getNumero() {
        return this.getVo().asBigDecimal("NUMERO");
   }

   public void setNumero(BigDecimal numero) {
        markAsChanged("NUMERO", numero);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
   }

   @Override
   public String getTableName() {
        return "TGFLOT";
   }

   @Override
   public String getEntityName() {
        return "Lote";
   }

   @Override
   public Lote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
