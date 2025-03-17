package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcumuladoAno extends AbstractSankhyaEntity<AcumuladoAno> {
   private BigDecimal ano;
   private BigDecimal codEmp;
   private BigDecimal codEvento;
   private BigDecimal codFunc;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal indAbril;
   private BigDecimal indAgosto;
   private BigDecimal indDezembro;
   private BigDecimal indFevereiro;
   private BigDecimal indJaneiro;
   private BigDecimal indJulho;
   private BigDecimal indJunho;
   private BigDecimal indMaio;
   private BigDecimal indMarco;
   private BigDecimal indNovembro;
   private BigDecimal indOutubro;
   private BigDecimal indSetembro;
   private BigDecimal sequencia;
   private BigDecimal tipEvento;
   private BigDecimal vlrAbril;
   private BigDecimal vlrAgosto;
   private BigDecimal vlrDezembro;
   private BigDecimal vlrFevereiro;
   private BigDecimal vlrJaneiro;
   private BigDecimal vlrJulho;
   private BigDecimal vlrJunho;
   private BigDecimal vlrMaio;
   private BigDecimal vlrMarco;
   private BigDecimal vlrNovembro;
   private BigDecimal vlrOutubro;
   private BigDecimal vlrSetembro;

   public BigDecimal getAno() {
        return ano;
   }

   public void setAno(BigDecimal ano) {
        this.ano = ano;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        this.codEvento = codEvento;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getIndAbril() {
        return indAbril;
   }

   public void setIndAbril(BigDecimal indAbril) {
        this.indAbril = indAbril;
   }

   public BigDecimal getIndAgosto() {
        return indAgosto;
   }

   public void setIndAgosto(BigDecimal indAgosto) {
        this.indAgosto = indAgosto;
   }

   public BigDecimal getIndDezembro() {
        return indDezembro;
   }

   public void setIndDezembro(BigDecimal indDezembro) {
        this.indDezembro = indDezembro;
   }

   public BigDecimal getIndFevereiro() {
        return indFevereiro;
   }

   public void setIndFevereiro(BigDecimal indFevereiro) {
        this.indFevereiro = indFevereiro;
   }

   public BigDecimal getIndJaneiro() {
        return indJaneiro;
   }

   public void setIndJaneiro(BigDecimal indJaneiro) {
        this.indJaneiro = indJaneiro;
   }

   public BigDecimal getIndJulho() {
        return indJulho;
   }

   public void setIndJulho(BigDecimal indJulho) {
        this.indJulho = indJulho;
   }

   public BigDecimal getIndJunho() {
        return indJunho;
   }

   public void setIndJunho(BigDecimal indJunho) {
        this.indJunho = indJunho;
   }

   public BigDecimal getIndMaio() {
        return indMaio;
   }

   public void setIndMaio(BigDecimal indMaio) {
        this.indMaio = indMaio;
   }

   public BigDecimal getIndMarco() {
        return indMarco;
   }

   public void setIndMarco(BigDecimal indMarco) {
        this.indMarco = indMarco;
   }

   public BigDecimal getIndNovembro() {
        return indNovembro;
   }

   public void setIndNovembro(BigDecimal indNovembro) {
        this.indNovembro = indNovembro;
   }

   public BigDecimal getIndOutubro() {
        return indOutubro;
   }

   public void setIndOutubro(BigDecimal indOutubro) {
        this.indOutubro = indOutubro;
   }

   public BigDecimal getIndSetembro() {
        return indSetembro;
   }

   public void setIndSetembro(BigDecimal indSetembro) {
        this.indSetembro = indSetembro;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getTipEvento() {
        return tipEvento;
   }

   public void setTipEvento(BigDecimal tipEvento) {
        this.tipEvento = tipEvento;
   }

   public BigDecimal getVlrAbril() {
        return vlrAbril;
   }

   public void setVlrAbril(BigDecimal vlrAbril) {
        this.vlrAbril = vlrAbril;
   }

   public BigDecimal getVlrAgosto() {
        return vlrAgosto;
   }

   public void setVlrAgosto(BigDecimal vlrAgosto) {
        this.vlrAgosto = vlrAgosto;
   }

   public BigDecimal getVlrDezembro() {
        return vlrDezembro;
   }

   public void setVlrDezembro(BigDecimal vlrDezembro) {
        this.vlrDezembro = vlrDezembro;
   }

   public BigDecimal getVlrFevereiro() {
        return vlrFevereiro;
   }

   public void setVlrFevereiro(BigDecimal vlrFevereiro) {
        this.vlrFevereiro = vlrFevereiro;
   }

   public BigDecimal getVlrJaneiro() {
        return vlrJaneiro;
   }

   public void setVlrJaneiro(BigDecimal vlrJaneiro) {
        this.vlrJaneiro = vlrJaneiro;
   }

   public BigDecimal getVlrJulho() {
        return vlrJulho;
   }

   public void setVlrJulho(BigDecimal vlrJulho) {
        this.vlrJulho = vlrJulho;
   }

   public BigDecimal getVlrJunho() {
        return vlrJunho;
   }

   public void setVlrJunho(BigDecimal vlrJunho) {
        this.vlrJunho = vlrJunho;
   }

   public BigDecimal getVlrMaio() {
        return vlrMaio;
   }

   public void setVlrMaio(BigDecimal vlrMaio) {
        this.vlrMaio = vlrMaio;
   }

   public BigDecimal getVlrMarco() {
        return vlrMarco;
   }

   public void setVlrMarco(BigDecimal vlrMarco) {
        this.vlrMarco = vlrMarco;
   }

   public BigDecimal getVlrNovembro() {
        return vlrNovembro;
   }

   public void setVlrNovembro(BigDecimal vlrNovembro) {
        this.vlrNovembro = vlrNovembro;
   }

   public BigDecimal getVlrOutubro() {
        return vlrOutubro;
   }

   public void setVlrOutubro(BigDecimal vlrOutubro) {
        this.vlrOutubro = vlrOutubro;
   }

   public BigDecimal getVlrSetembro() {
        return vlrSetembro;
   }

   public void setVlrSetembro(BigDecimal vlrSetembro) {
        this.vlrSetembro = vlrSetembro;
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
        this.ano = vo.asBigDecimal("ANO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.indAbril = vo.asBigDecimal("INDABRIL");
        this.indAgosto = vo.asBigDecimal("INDAGOSTO");
        this.indDezembro = vo.asBigDecimal("INDDEZEMBRO");
        this.indFevereiro = vo.asBigDecimal("INDFEVEREIRO");
        this.indJaneiro = vo.asBigDecimal("INDJANEIRO");
        this.indJulho = vo.asBigDecimal("INDJULHO");
        this.indJunho = vo.asBigDecimal("INDJUNHO");
        this.indMaio = vo.asBigDecimal("INDMAIO");
        this.indMarco = vo.asBigDecimal("INDMARCO");
        this.indNovembro = vo.asBigDecimal("INDNOVEMBRO");
        this.indOutubro = vo.asBigDecimal("INDOUTUBRO");
        this.indSetembro = vo.asBigDecimal("INDSETEMBRO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipEvento = vo.asBigDecimal("TIPEVENTO");
        this.vlrAbril = vo.asBigDecimal("VLRABRIL");
        this.vlrAgosto = vo.asBigDecimal("VLRAGOSTO");
        this.vlrDezembro = vo.asBigDecimal("VLRDEZEMBRO");
        this.vlrFevereiro = vo.asBigDecimal("VLRFEVEREIRO");
        this.vlrJaneiro = vo.asBigDecimal("VLRJANEIRO");
        this.vlrJulho = vo.asBigDecimal("VLRJULHO");
        this.vlrJunho = vo.asBigDecimal("VLRJUNHO");
        this.vlrMaio = vo.asBigDecimal("VLRMAIO");
        this.vlrMarco = vo.asBigDecimal("VLRMARCO");
        this.vlrNovembro = vo.asBigDecimal("VLRNOVEMBRO");
        this.vlrOutubro = vo.asBigDecimal("VLROUTUBRO");
        this.vlrSetembro = vo.asBigDecimal("VLRSETEMBRO");
        return this;
   }
}
