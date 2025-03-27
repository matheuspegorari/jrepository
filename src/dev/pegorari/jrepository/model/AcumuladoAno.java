package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcumuladoAno extends AbstractSankhyaEntity<AcumuladoAno> {
   public BigDecimal getAno() {
        return this.getVo().asBigDecimal("ANO");
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
   }

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

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getIndAbril() {
        return this.getVo().asBigDecimal("INDABRIL");
   }

   public void setIndAbril(BigDecimal indAbril) {
        markAsChanged("INDABRIL", indAbril);
   }

   public BigDecimal getIndAgosto() {
        return this.getVo().asBigDecimal("INDAGOSTO");
   }

   public void setIndAgosto(BigDecimal indAgosto) {
        markAsChanged("INDAGOSTO", indAgosto);
   }

   public BigDecimal getIndDezembro() {
        return this.getVo().asBigDecimal("INDDEZEMBRO");
   }

   public void setIndDezembro(BigDecimal indDezembro) {
        markAsChanged("INDDEZEMBRO", indDezembro);
   }

   public BigDecimal getIndFevereiro() {
        return this.getVo().asBigDecimal("INDFEVEREIRO");
   }

   public void setIndFevereiro(BigDecimal indFevereiro) {
        markAsChanged("INDFEVEREIRO", indFevereiro);
   }

   public BigDecimal getIndJaneiro() {
        return this.getVo().asBigDecimal("INDJANEIRO");
   }

   public void setIndJaneiro(BigDecimal indJaneiro) {
        markAsChanged("INDJANEIRO", indJaneiro);
   }

   public BigDecimal getIndJulho() {
        return this.getVo().asBigDecimal("INDJULHO");
   }

   public void setIndJulho(BigDecimal indJulho) {
        markAsChanged("INDJULHO", indJulho);
   }

   public BigDecimal getIndJunho() {
        return this.getVo().asBigDecimal("INDJUNHO");
   }

   public void setIndJunho(BigDecimal indJunho) {
        markAsChanged("INDJUNHO", indJunho);
   }

   public BigDecimal getIndMaio() {
        return this.getVo().asBigDecimal("INDMAIO");
   }

   public void setIndMaio(BigDecimal indMaio) {
        markAsChanged("INDMAIO", indMaio);
   }

   public BigDecimal getIndMarco() {
        return this.getVo().asBigDecimal("INDMARCO");
   }

   public void setIndMarco(BigDecimal indMarco) {
        markAsChanged("INDMARCO", indMarco);
   }

   public BigDecimal getIndNovembro() {
        return this.getVo().asBigDecimal("INDNOVEMBRO");
   }

   public void setIndNovembro(BigDecimal indNovembro) {
        markAsChanged("INDNOVEMBRO", indNovembro);
   }

   public BigDecimal getIndOutubro() {
        return this.getVo().asBigDecimal("INDOUTUBRO");
   }

   public void setIndOutubro(BigDecimal indOutubro) {
        markAsChanged("INDOUTUBRO", indOutubro);
   }

   public BigDecimal getIndSetembro() {
        return this.getVo().asBigDecimal("INDSETEMBRO");
   }

   public void setIndSetembro(BigDecimal indSetembro) {
        markAsChanged("INDSETEMBRO", indSetembro);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTipEvento() {
        return this.getVo().asBigDecimal("TIPEVENTO");
   }

   public void setTipEvento(BigDecimal tipEvento) {
        markAsChanged("TIPEVENTO", tipEvento);
   }

   public BigDecimal getVlrAbril() {
        return this.getVo().asBigDecimal("VLRABRIL");
   }

   public void setVlrAbril(BigDecimal vlrAbril) {
        markAsChanged("VLRABRIL", vlrAbril);
   }

   public BigDecimal getVlrAgosto() {
        return this.getVo().asBigDecimal("VLRAGOSTO");
   }

   public void setVlrAgosto(BigDecimal vlrAgosto) {
        markAsChanged("VLRAGOSTO", vlrAgosto);
   }

   public BigDecimal getVlrDezembro() {
        return this.getVo().asBigDecimal("VLRDEZEMBRO");
   }

   public void setVlrDezembro(BigDecimal vlrDezembro) {
        markAsChanged("VLRDEZEMBRO", vlrDezembro);
   }

   public BigDecimal getVlrFevereiro() {
        return this.getVo().asBigDecimal("VLRFEVEREIRO");
   }

   public void setVlrFevereiro(BigDecimal vlrFevereiro) {
        markAsChanged("VLRFEVEREIRO", vlrFevereiro);
   }

   public BigDecimal getVlrJaneiro() {
        return this.getVo().asBigDecimal("VLRJANEIRO");
   }

   public void setVlrJaneiro(BigDecimal vlrJaneiro) {
        markAsChanged("VLRJANEIRO", vlrJaneiro);
   }

   public BigDecimal getVlrJulho() {
        return this.getVo().asBigDecimal("VLRJULHO");
   }

   public void setVlrJulho(BigDecimal vlrJulho) {
        markAsChanged("VLRJULHO", vlrJulho);
   }

   public BigDecimal getVlrJunho() {
        return this.getVo().asBigDecimal("VLRJUNHO");
   }

   public void setVlrJunho(BigDecimal vlrJunho) {
        markAsChanged("VLRJUNHO", vlrJunho);
   }

   public BigDecimal getVlrMaio() {
        return this.getVo().asBigDecimal("VLRMAIO");
   }

   public void setVlrMaio(BigDecimal vlrMaio) {
        markAsChanged("VLRMAIO", vlrMaio);
   }

   public BigDecimal getVlrMarco() {
        return this.getVo().asBigDecimal("VLRMARCO");
   }

   public void setVlrMarco(BigDecimal vlrMarco) {
        markAsChanged("VLRMARCO", vlrMarco);
   }

   public BigDecimal getVlrNovembro() {
        return this.getVo().asBigDecimal("VLRNOVEMBRO");
   }

   public void setVlrNovembro(BigDecimal vlrNovembro) {
        markAsChanged("VLRNOVEMBRO", vlrNovembro);
   }

   public BigDecimal getVlrOutubro() {
        return this.getVo().asBigDecimal("VLROUTUBRO");
   }

   public void setVlrOutubro(BigDecimal vlrOutubro) {
        markAsChanged("VLROUTUBRO", vlrOutubro);
   }

   public BigDecimal getVlrSetembro() {
        return this.getVo().asBigDecimal("VLRSETEMBRO");
   }

   public void setVlrSetembro(BigDecimal vlrSetembro) {
        markAsChanged("VLRSETEMBRO", vlrSetembro);
   }

   @Override
   public String getTableName() {
        return "TFPACU";
   }

   @Override
   public String getEntityName() {
        return "AcumuladoAno";
   }

   @Override
   public AcumuladoAno fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
