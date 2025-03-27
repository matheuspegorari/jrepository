package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BloqueioFechamentoContabil extends AbstractSankhyaEntity<BloqueioFechamentoContabil> {
   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public Timestamp getDtFechamentoBco() {
        return this.getVo().asTimestamp("DTFECHAMENTOBCO");
   }

   public void setDtFechamentoBco(Timestamp dtFechamentoBco) {
        markAsChanged("DTFECHAMENTOBCO", dtFechamentoBco);
   }

   public Timestamp getDtFechamentoCtb() {
        return this.getVo().asTimestamp("DTFECHAMENTOCTB");
   }

   public void setDtFechamentoCtb(Timestamp dtFechamentoCtb) {
        markAsChanged("DTFECHAMENTOCTB", dtFechamentoCtb);
   }

   public Timestamp getDtFechamentoCus() {
        return this.getVo().asTimestamp("DTFECHAMENTOCUS");
   }

   public void setDtFechamentoCus(Timestamp dtFechamentoCus) {
        markAsChanged("DTFECHAMENTOCUS", dtFechamentoCus);
   }

   public Timestamp getDtFechamentoDesp() {
        return this.getVo().asTimestamp("DTFECHAMENTODESP");
   }

   public void setDtFechamentoDesp(Timestamp dtFechamentoDesp) {
        markAsChanged("DTFECHAMENTODESP", dtFechamentoDesp);
   }

   public Timestamp getDtFechamentoFis() {
        return this.getVo().asTimestamp("DTFECHAMENTOFIS");
   }

   public void setDtFechamentoFis(Timestamp dtFechamentoFis) {
        markAsChanged("DTFECHAMENTOFIS", dtFechamentoFis);
   }

   public Timestamp getDtFechamentoRec() {
        return this.getVo().asTimestamp("DTFECHAMENTOREC");
   }

   public void setDtFechamentoRec(Timestamp dtFechamentoRec) {
        markAsChanged("DTFECHAMENTOREC", dtFechamentoRec);
   }

   public Timestamp getDtFechamentoSai() {
        return this.getVo().asTimestamp("DTFECHAMENTOSAI");
   }

   public void setDtFechamentoSai(Timestamp dtFechamentoSai) {
        markAsChanged("DTFECHAMENTOSAI", dtFechamentoSai);
   }

   public BigDecimal getNuBloqueio() {
        return this.getVo().asBigDecimal("NUBLOQUEIO");
   }

   public void setNuBloqueio(BigDecimal nuBloqueio) {
        markAsChanged("NUBLOQUEIO", nuBloqueio);
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

   public String getTipoFechaCalcust() {
        return this.getVo().asString("TIPOFECHACALCUST");
   }

   public void setTipoFechaCalcust(String tipoFechaCalcust) {
        markAsChanged("TIPOFECHACALCUST", tipoFechaCalcust);
   }

   public String getTipoFechaEstEnt() {
        return this.getVo().asString("TIPOFECHAESTENT");
   }

   public void setTipoFechaEstEnt(String tipoFechaEstEnt) {
        markAsChanged("TIPOFECHAESTENT", tipoFechaEstEnt);
   }

   public String getTipoFechaEstSai() {
        return this.getVo().asString("TIPOFECHAESTSAI");
   }

   public void setTipoFechaEstSai(String tipoFechaEstSai) {
        markAsChanged("TIPOFECHAESTSAI", tipoFechaEstSai);
   }

   public String getTipoFechaFinDesp() {
        return this.getVo().asString("TIPOFECHAFINDESP");
   }

   public void setTipoFechaFinDesp(String tipoFechaFinDesp) {
        markAsChanged("TIPOFECHAFINDESP", tipoFechaFinDesp);
   }

   public String getTipoFechaFinRec() {
        return this.getVo().asString("TIPOFECHAFINREC");
   }

   public void setTipoFechaFinRec(String tipoFechaFinRec) {
        markAsChanged("TIPOFECHAFINREC", tipoFechaFinRec);
   }

   public String getTipoFechaMovBco() {
        return this.getVo().asString("TIPOFECHAMOVBCO");
   }

   public void setTipoFechaMovBco(String tipoFechaMovBco) {
        markAsChanged("TIPOFECHAMOVBCO", tipoFechaMovBco);
   }

   public String getTipoFechaMovCtb() {
        return this.getVo().asString("TIPOFECHAMOVCTB");
   }

   public void setTipoFechaMovCtb(String tipoFechaMovCtb) {
        markAsChanged("TIPOFECHAMOVCTB", tipoFechaMovCtb);
   }

   public String getTipoFechaMovFis() {
        return this.getVo().asString("TIPOFECHAMOVFIS");
   }

   public void setTipoFechaMovFis(String tipoFechaMovFis) {
        markAsChanged("TIPOFECHAMOVFIS", tipoFechaMovFis);
   }

   public Timestamp getDtFechamentoEnt() {
        return this.getVo().asTimestamp("DTFECHAMENTOENT");
   }

   public void setDtFechamentoEnt(Timestamp dtFechamentoEnt) {
        markAsChanged("DTFECHAMENTOENT", dtFechamentoEnt);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getRefFixa() {
        return this.getVo().asString("REFFIXA");
   }

   public void setRefFixa(String refFixa) {
        markAsChanged("REFFIXA", refFixa);
   }

   @Override
   public String getTableName() {
        return "TCBBFC";
   }

   @Override
   public String getEntityName() {
        return "BloqueioFechamentoContabil";
   }

   @Override
   public BloqueioFechamentoContabil fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
