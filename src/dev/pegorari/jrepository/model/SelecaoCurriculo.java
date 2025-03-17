package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class SelecaoCurriculo implements SankhyaEntity<SelecaoCurriculo> {

   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private BigDecimal codUsu;
   private BigDecimal codUsuAprov;
   private Timestamp dtAlter;
   private Timestamp dtAprov;
   private BigDecimal notaSelecao;
   private BigDecimal nuCurriculo;
   private BigDecimal nuRequisicao;
   private BigDecimal nuSelecao;
   private String obsAprov;
   private BigDecimal resultado;
   private String status;
   private String statusAprov;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
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

   public BigDecimal getCodUsuAprov() {
        return codUsuAprov;
   }

   public void setCodUsuAprov(BigDecimal codUsuAprov) {
        this.codUsuAprov = codUsuAprov;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtAprov() {
        return dtAprov;
   }

   public void setDtAprov(Timestamp dtAprov) {
        this.dtAprov = dtAprov;
   }

   public BigDecimal getNotaSelecao() {
        return notaSelecao;
   }

   public void setNotaSelecao(BigDecimal notaSelecao) {
        this.notaSelecao = notaSelecao;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        this.nuSelecao = nuSelecao;
   }

   public String getObsAprov() {
        return obsAprov;
   }

   public void setObsAprov(String obsAprov) {
        this.obsAprov = obsAprov;
   }

   public BigDecimal getResultado() {
        return resultado;
   }

   public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public String getStatusAprov() {
        return statusAprov;
   }

   public void setStatusAprov(String statusAprov) {
        this.statusAprov = statusAprov;
   }

   @Override
   public String getEntityName() {
        return "SelecaoCurriculo";
   }

   @Override
   public SelecaoCurriculo fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuAprov = vo.asBigDecimal("CODUSUAPROV");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtAprov = vo.asTimestamp("DTAPROV");
        this.notaSelecao = vo.asBigDecimal("NOTASELECAO");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.obsAprov = vo.asString("OBSAPROV");
        this.resultado = vo.asBigDecimal("RESULTADO");
        this.status = vo.asString("STATUS");
        this.statusAprov = vo.asString("STATUSAPROV");
        return this;
   }
}
