package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ConferenciaCega extends AbstractSankhyaEntity<ConferenciaCega> {
   private BigDecimal codUsu;
   private String destFinal;
   private Timestamp dhFinalConf;
   private Timestamp dhInicioConf;
   private BigDecimal nuConferencia;
   private BigDecimal nuRecebimento;
   private String parcial;
   private String situacao;
   private String tipConf;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDestFinal() {
        return destFinal;
   }

   public void setDestFinal(String destFinal) {
        markAsChanged("DESTFINAL", destFinal);
        this.destFinal = destFinal;
   }

   public Timestamp getDhFinalConf() {
        return dhFinalConf;
   }

   public void setDhFinalConf(Timestamp dhFinalConf) {
        markAsChanged("DHFINALCONF", dhFinalConf);
        this.dhFinalConf = dhFinalConf;
   }

   public Timestamp getDhInicioConf() {
        return dhInicioConf;
   }

   public void setDhInicioConf(Timestamp dhInicioConf) {
        markAsChanged("DHINICIOCONF", dhInicioConf);
        this.dhInicioConf = dhInicioConf;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public String getParcial() {
        return parcial;
   }

   public void setParcial(String parcial) {
        markAsChanged("PARCIAL", parcial);
        this.parcial = parcial;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getTipConf() {
        return tipConf;
   }

   public void setTipConf(String tipConf) {
        markAsChanged("TIPCONF", tipConf);
        this.tipConf = tipConf;
   }

   @Override
   public String getTableName() {
        return "TGWCON";
   }

   @Override
   public String getEntityName() {
        return "ConferenciaCega";
   }

   @Override
   public ConferenciaCega fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.destFinal = vo.asString("DESTFINAL");
        this.dhFinalConf = vo.asTimestamp("DHFINALCONF");
        this.dhInicioConf = vo.asTimestamp("DHINICIOCONF");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.parcial = vo.asString("PARCIAL");
        this.situacao = vo.asString("SITUACAO");
        this.tipConf = vo.asString("TIPCONF");
        return this;
   }
}
