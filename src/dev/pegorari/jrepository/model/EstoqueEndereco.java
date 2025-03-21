package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EstoqueEndereco extends AbstractSankhyaEntity<EstoqueEndereco> {
   private BigDecimal codEmp;
   private BigDecimal codEnd;
   private BigDecimal codLocal;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private String codVol;
   private String controle;
   private Timestamp dtRec;
   private Timestamp dtVal;
   private BigDecimal entradasPend;
   private BigDecimal entrPendVolPad;
   private BigDecimal estoque;
   private BigDecimal estoqueVolPad;
   private BigDecimal idPalete;
   private BigDecimal saidasPend;
   private BigDecimal saidPendVolPad;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDtRec() {
        return dtRec;
   }

   public void setDtRec(Timestamp dtRec) {
        markAsChanged("DTREC", dtRec);
        this.dtRec = dtRec;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        markAsChanged("DTVAL", dtVal);
        this.dtVal = dtVal;
   }

   public BigDecimal getEntradasPend() {
        return entradasPend;
   }

   public void setEntradasPend(BigDecimal entradasPend) {
        markAsChanged("ENTRADASPEND", entradasPend);
        this.entradasPend = entradasPend;
   }

   public BigDecimal getEntrPendVolPad() {
        return entrPendVolPad;
   }

   public void setEntrPendVolPad(BigDecimal entrPendVolPad) {
        markAsChanged("ENTRPENDVOLPAD", entrPendVolPad);
        this.entrPendVolPad = entrPendVolPad;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        markAsChanged("ESTOQUE", estoque);
        this.estoque = estoque;
   }

   public BigDecimal getEstoqueVolPad() {
        return estoqueVolPad;
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        markAsChanged("ESTOQUEVOLPAD", estoqueVolPad);
        this.estoqueVolPad = estoqueVolPad;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
        this.idPalete = idPalete;
   }

   public BigDecimal getSaidasPend() {
        return saidasPend;
   }

   public void setSaidasPend(BigDecimal saidasPend) {
        markAsChanged("SAIDASPEND", saidasPend);
        this.saidasPend = saidasPend;
   }

   public BigDecimal getSaidPendVolPad() {
        return saidPendVolPad;
   }

   public void setSaidPendVolPad(BigDecimal saidPendVolPad) {
        markAsChanged("SAIDPENDVOLPAD", saidPendVolPad);
        this.saidPendVolPad = saidPendVolPad;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codVol = vo.asString("CODVOL");
        this.controle = vo.asString("CONTROLE");
        this.dtRec = vo.asTimestamp("DTREC");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.entradasPend = vo.asBigDecimal("ENTRADASPEND");
        this.entrPendVolPad = vo.asBigDecimal("ENTRPENDVOLPAD");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.estoqueVolPad = vo.asBigDecimal("ESTOQUEVOLPAD");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.saidasPend = vo.asBigDecimal("SAIDASPEND");
        this.saidPendVolPad = vo.asBigDecimal("SAIDPENDVOLPAD");
        return this;
   }
}
