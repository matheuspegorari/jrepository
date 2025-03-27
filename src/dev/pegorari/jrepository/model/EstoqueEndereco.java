package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EstoqueEndereco extends AbstractSankhyaEntity<EstoqueEndereco> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
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

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public Timestamp getDtRec() {
        return this.getVo().asTimestamp("DTREC");
   }

   public void setDtRec(Timestamp dtRec) {
        markAsChanged("DTREC", dtRec);
   }

   public Timestamp getDtVal() {
        return this.getVo().asTimestamp("DTVAL");
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
   }

   public BigDecimal getEntradasPend() {
        return this.getVo().asBigDecimal("ENTRADASPEND");
   }

   public void setEntradasPend(BigDecimal entradasPend) {
        markAsChanged("ENTRADASPEND", entradasPend);
   }

   public BigDecimal getEntrPendVolPad() {
        return this.getVo().asBigDecimal("ENTRPENDVOLPAD");
   }

   public void setEntrPendVolPad(BigDecimal entrPendVolPad) {
        markAsChanged("ENTRPENDVOLPAD", entrPendVolPad);
   }

   public BigDecimal getEstoque() {
        return this.getVo().asBigDecimal("ESTOQUE");
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
   }

   public BigDecimal getEstoqueVolPad() {
        return this.getVo().asBigDecimal("ESTOQUEVOLPAD");
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        markAsChanged("ESTOQUEVOLPAD", estoqueVolPad);
   }

   public BigDecimal getIdPalete() {
        return this.getVo().asBigDecimal("IDPALETE");
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
   }

   public BigDecimal getSaidasPend() {
        return this.getVo().asBigDecimal("SAIDASPEND");
   }

   public void setSaidasPend(BigDecimal saidasPend) {
        markAsChanged("SAIDASPEND", saidasPend);
   }

   public BigDecimal getSaidPendVolPad() {
        return this.getVo().asBigDecimal("SAIDPENDVOLPAD");
   }

   public void setSaidPendVolPad(BigDecimal saidPendVolPad) {
        markAsChanged("SAIDPENDVOLPAD", saidPendVolPad);
   }

   @Override
   public String getTableName() {
        return "TGWEST";
   }

   @Override
   public String getEntityName() {
        return "EstoqueEndereco";
   }

   @Override
   public EstoqueEndereco fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
