package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Candidato extends AbstractSankhyaEntity<Candidato> {
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
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuAprov() {
        return codUsuAprov;
   }

   public void setCodUsuAprov(BigDecimal codUsuAprov) {
        markAsChanged("CODUSUAPROV", codUsuAprov);
        this.codUsuAprov = codUsuAprov;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtAprov() {
        return dtAprov;
   }

   public void setDtAprov(Timestamp dtAprov) {
        markAsChanged("DTAPROV", dtAprov);
        this.dtAprov = dtAprov;
   }

   public BigDecimal getNotaSelecao() {
        return notaSelecao;
   }

   public void setNotaSelecao(BigDecimal notaSelecao) {
        markAsChanged("NOTASELECAO", notaSelecao);
        this.notaSelecao = notaSelecao;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
        this.nuCurriculo = nuCurriculo;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
        this.nuSelecao = nuSelecao;
   }

   public String getObsAprov() {
        return obsAprov;
   }

   public void setObsAprov(String obsAprov) {
        markAsChanged("OBSAPROV", obsAprov);
        this.obsAprov = obsAprov;
   }

   public BigDecimal getResultado() {
        return resultado;
   }

   public void setResultado(BigDecimal resultado) {
        markAsChanged("RESULTADO", resultado);
        this.resultado = resultado;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getStatusAprov() {
        return statusAprov;
   }

   public void setStatusAprov(String statusAprov) {
        markAsChanged("STATUSAPROV", statusAprov);
        this.statusAprov = statusAprov;
   }

   @Override
   public String getTableName() {
        return "TRSCAN";
   }

   @Override
   public String getEntityName() {
        return "Candidato";
   }

   @Override
   public Candidato fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
