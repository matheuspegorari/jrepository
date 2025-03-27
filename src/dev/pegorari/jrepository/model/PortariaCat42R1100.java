package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PortariaCat42R1100 extends AbstractSankhyaEntity<PortariaCat42R1100> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getData() {
        return this.getVo().asTimestamp("DATA");
   }

   public void setData(Timestamp data) {
        markAsChanged("DATA", data);
   }

   public String getDigitado() {
        return this.getVo().asString("DIGITADO");
   }

   public void setDigitado(String digitado) {
        markAsChanged("DIGITADO", digitado);
   }

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public BigDecimal getIcmsTot() {
        return this.getVo().asBigDecimal("ICMSTOT");
   }

   public void setIcmsTot(BigDecimal icmsTot) {
        markAsChanged("ICMSTOT", icmsTot);
   }

   public BigDecimal getIndOper() {
        return this.getVo().asBigDecimal("INDOPER");
   }

   public void setIndOper(BigDecimal indOper) {
        markAsChanged("INDOPER", indOper);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public String getReg() {
        return this.getVo().asString("REG");
   }

   public void setReg(String reg) {
        markAsChanged("REG", reg);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipMov() {
        return this.getVo().asString("TIPMOV");
   }

   public void setTipMov(String tipMov) {
        markAsChanged("TIPMOV", tipMov);
   }

   public BigDecimal getVlConfr() {
        return this.getVo().asBigDecimal("VLCONFR");
   }

   public void setVlConfr(BigDecimal vlConfr) {
        markAsChanged("VLCONFR", vlConfr);
   }

   public BigDecimal getVlrParaAtualSaldo() {
        return this.getVo().asBigDecimal("VLRPARAATUALSALDO");
   }

   public void setVlrParaAtualSaldo(BigDecimal vlrParaAtualSaldo) {
        markAsChanged("VLRPARAATUALSALDO", vlrParaAtualSaldo);
   }

   public BigDecimal getVlrUnit() {
        return this.getVo().asBigDecimal("VLRUNIT");
   }

   public void setVlrUnit(BigDecimal vlrUnit) {
        markAsChanged("VLRUNIT", vlrUnit);
   }

   public BigDecimal getBaseIcmsTot() {
        return this.getVo().asBigDecimal("BASEICMSTOT");
   }

   public void setBaseIcmsTot(BigDecimal baseIcmsTot) {
        markAsChanged("BASEICMSTOT", baseIcmsTot);
   }

   public String getChvDoc() {
        return this.getVo().asString("CHVDOC");
   }

   public void setChvDoc(String chvDoc) {
        markAsChanged("CHVDOC", chvDoc);
   }

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getCodItem() {
        return this.getVo().asString("CODITEM");
   }

   public void setCodItem(String codItem) {
        markAsChanged("CODITEM", codItem);
   }

   public BigDecimal getCodLegal() {
        return this.getVo().asBigDecimal("CODLEGAL");
   }

   public void setCodLegal(BigDecimal codLegal) {
        markAsChanged("CODLEGAL", codLegal);
   }

   public BigDecimal getVlrIcms() {
        return this.getVo().asBigDecimal("VLRICMS");
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        markAsChanged("VLRICMS", vlrIcms);
   }

   public BigDecimal getTipoDivergencia() {
        return this.getVo().asBigDecimal("TIPODIVERGENCIA");
   }

   public void setTipoDivergencia(BigDecimal tipoDivergencia) {
        markAsChanged("TIPODIVERGENCIA", tipoDivergencia);
   }

   @Override
   public String getTableName() {
        return "TGFCAT42R1100";
   }

   @Override
   public String getEntityName() {
        return "PortariaCat42R1100";
   }

   @Override
   public PortariaCat42R1100 fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
