package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Candidato extends AbstractSankhyaEntity<Candidato> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
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

   public BigDecimal getCodUsuAprov() {
        return this.getVo().asBigDecimal("CODUSUAPROV");
   }

   public void setCodUsuAprov(BigDecimal codUsuAprov) {
        markAsChanged("CODUSUAPROV", codUsuAprov);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtAprov() {
        return this.getVo().asTimestamp("DTAPROV");
   }

   public void setDtAprov(Timestamp dtAprov) {
        markAsChanged("DTAPROV", dtAprov);
   }

   public BigDecimal getNotaSelecao() {
        return this.getVo().asBigDecimal("NOTASELECAO");
   }

   public void setNotaSelecao(BigDecimal notaSelecao) {
        markAsChanged("NOTASELECAO", notaSelecao);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public BigDecimal getNuRequisicao() {
        return this.getVo().asBigDecimal("NUREQUISICAO");
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
   }

   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
   }

   public String getObsAprov() {
        return this.getVo().asString("OBSAPROV");
   }

   public void setObsAprov(String obsAprov) {
        markAsChanged("OBSAPROV", obsAprov);
   }

   public BigDecimal getResultado() {
        return this.getVo().asBigDecimal("RESULTADO");
   }

   public void setResultado(BigDecimal resultado) {
        markAsChanged("RESULTADO", resultado);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getStatusAprov() {
        return this.getVo().asString("STATUSAPROV");
   }

   public void setStatusAprov(String statusAprov) {
        markAsChanged("STATUSAPROV", statusAprov);
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
        this.setVo(vo);
        return this;
   }
}
