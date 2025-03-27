package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ValorComissaoVendedor extends AbstractSankhyaEntity<ValorComissaoVendedor> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodForm() {
        return this.getVo().asBigDecimal("CODFORM");
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getIndiceProdutividade() {
        return this.getVo().asBigDecimal("INDICEPRODUTIVIDADE");
   }

   public void setIndiceProdutividade(BigDecimal indiceProdutividade) {
        markAsChanged("INDICEPRODUTIVIDADE", indiceProdutividade);
   }

   public BigDecimal getNuFechamento() {
        return this.getVo().asBigDecimal("NUFECHAMENTO");
   }

   public void setNuFechamento(BigDecimal nuFechamento) {
        markAsChanged("NUFECHAMENTO", nuFechamento);
   }

   public BigDecimal getNuFin() {
        return this.getVo().asBigDecimal("NUFIN");
   }

   public void setNuFin(BigDecimal nuFin) {
        markAsChanged("NUFIN", nuFin);
   }

   public BigDecimal getNuFinOrig() {
        return this.getVo().asBigDecimal("NUFINORIG");
   }

   public void setNuFinOrig(BigDecimal nuFinOrig) {
        markAsChanged("NUFINORIG", nuFinOrig);
   }

   public BigDecimal getNumItemOrig() {
        return this.getVo().asBigDecimal("NUMITEMORIG");
   }

   public void setNumItemOrig(BigDecimal numItemOrig) {
        markAsChanged("NUMITEMORIG", numItemOrig);
   }

   public BigDecimal getNumOsOrig() {
        return this.getVo().asBigDecimal("NUMOSORIG");
   }

   public void setNumOsOrig(BigDecimal numOsOrig) {
        markAsChanged("NUMOSORIG", numOsOrig);
   }

   public BigDecimal getNuNotaOrig() {
        return this.getVo().asBigDecimal("NUNOTAORIG");
   }

   public void setNuNotaOrig(BigDecimal nuNotaOrig) {
        markAsChanged("NUNOTAORIG", nuNotaOrig);
   }

   public BigDecimal getQtdHora() {
        return this.getVo().asBigDecimal("QTDHORA");
   }

   public void setQtdHora(BigDecimal qtdHora) {
        markAsChanged("QTDHORA", qtdHora);
   }

   public BigDecimal getQtdHoraExtra() {
        return this.getVo().asBigDecimal("QTDHORAEXTRA");
   }

   public void setQtdHoraExtra(BigDecimal qtdHoraExtra) {
        markAsChanged("QTDHORAEXTRA", qtdHoraExtra);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVlrCom() {
        return this.getVo().asBigDecimal("VLRCOM");
   }

   public void setVlrCom(BigDecimal vlrCom) {
        markAsChanged("VLRCOM", vlrCom);
   }

   public BigDecimal getVlrHora() {
        return this.getVo().asBigDecimal("VLRHORA");
   }

   public void setVlrHora(BigDecimal vlrHora) {
        markAsChanged("VLRHORA", vlrHora);
   }

   public BigDecimal getVlrHoraExtra() {
        return this.getVo().asBigDecimal("VLRHORAEXTRA");
   }

   public void setVlrHoraExtra(BigDecimal vlrHoraExtra) {
        markAsChanged("VLRHORAEXTRA", vlrHoraExtra);
   }

   public BigDecimal getVlrResiduoCom() {
        return this.getVo().asBigDecimal("VLRRESIDUOCOM");
   }

   public void setVlrResiduoCom(BigDecimal vlrResiduoCom) {
        markAsChanged("VLRRESIDUOCOM", vlrResiduoCom);
   }

   @Override
   public String getTableName() {
        return "TGFCOM";
   }

   @Override
   public String getEntityName() {
        return "ValorComissaoVendedor";
   }

   @Override
   public ValorComissaoVendedor fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
