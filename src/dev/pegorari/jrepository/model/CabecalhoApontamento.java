package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoApontamento extends AbstractSankhyaEntity<CabecalhoApontamento> {
   private BigDecimal codUsu;
   private BigDecimal nuApo;
   private BigDecimal idAtv;
   private Timestamp dhApo;
   private String situacao;
   private String observacao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuApo() {
        return nuApo;
   }

   public void setNuApo(BigDecimal nuApo) {
        this.nuApo = nuApo;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        this.idAtv = idAtv;
   }

   public Timestamp getDhApo() {
        return dhApo;
   }

   public void setDhApo(Timestamp dhApo) {
        this.dhApo = dhApo;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   @Override
   public String getTableName() {
        return "TPRAPO";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoApontamento";
   }

   @Override
   public CabecalhoApontamento fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuApo = vo.asBigDecimal("NUAPO");
        this.idAtv = vo.asBigDecimal("IDIATV");
        this.dhApo = vo.asTimestamp("DHAPO");
        this.situacao = vo.asString("SITUACAO");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
