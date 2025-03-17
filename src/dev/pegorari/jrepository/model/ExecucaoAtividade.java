package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecucaoAtividade implements SankhyaEntity<ExecucaoAtividade> {

   private BigDecimal codMtp;
   private String observacao;
   private String tipo;
   private Timestamp dhInicio;
   private BigDecimal codExec;
   private BigDecimal codUsu;
   private BigDecimal ideIatv;
   private Timestamp dhFinal;
   private BigDecimal idIatv;

   public BigDecimal getCodMtp() {
        return codMtp;
   }

   public void setCodMtp(BigDecimal codMtp) {
        this.codMtp = codMtp;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        this.dhInicio = dhInicio;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        this.codExec = codExec;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getIdeIatv() {
        return ideIatv;
   }

   public void setIdeIatv(BigDecimal ideIatv) {
        this.ideIatv = ideIatv;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        this.dhFinal = dhFinal;
   }

   public BigDecimal getIdIatv() {
        return idIatv;
   }

   public void setIdIatv(BigDecimal idIatv) {
        this.idIatv = idIatv;
   }

   @Override
   public String getEntityName() {
        return "ExecucaoAtividade";
   }

   @Override
   public ExecucaoAtividade fromVO(DynamicVO vo) {
        this.codMtp = vo.asBigDecimal("CODMTP");
        this.observacao = vo.asString("OBSERVACAO");
        this.tipo = vo.asString("TIPO");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.ideIatv = vo.asBigDecimal("IDEIATV");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.idIatv = vo.asBigDecimal("IDIATV");
        return this;
   }
}
