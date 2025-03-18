package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ExecucaoAtividade extends AbstractSankhyaEntity<ExecucaoAtividade> {
   private BigDecimal codMtp;
   private String observacao;
   private String tipo;
   private Timestamp dhInicio;
   private BigDecimal codExec;
   private BigDecimal codUsu;
   private BigDecimal ideiAtv;
   private Timestamp dhFinal;
   private BigDecimal idAtv;

   public BigDecimal getCodMtp() {
        return codMtp;
   }

   public void setCodMtp(BigDecimal codMtp) {
        markAsChanged("CODMTP", codMtp);
        this.codMtp = codMtp;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
        this.dhInicio = dhInicio;
   }

   public BigDecimal getCodExec() {
        return codExec;
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
        this.codExec = codExec;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getIdeiAtv() {
        return ideiAtv;
   }

   public void setIdeiAtv(BigDecimal ideiAtv) {
        markAsChanged("IDEIATV", ideiAtv);
        this.ideiAtv = ideiAtv;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
        this.dhFinal = dhFinal;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        markAsChanged("IDIATV", idAtv);
        this.idAtv = idAtv;
   }

   @Override
   public String getTableName() {
        return "TPREIATV";
   }

   @Override
   public String getEntityName() {
        return "ExecucaoAtividade";
   }

   @Override
   public ExecucaoAtividade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codMtp = vo.asBigDecimal("CODMTP");
        this.observacao = vo.asString("OBSERVACAO");
        this.tipo = vo.asString("TIPO");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.codExec = vo.asBigDecimal("CODEXEC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.ideiAtv = vo.asBigDecimal("IDEIATV");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.idAtv = vo.asBigDecimal("IDIATV");
        return this;
   }
}
