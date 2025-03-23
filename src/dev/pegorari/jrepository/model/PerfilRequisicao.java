package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilRequisicao extends AbstractSankhyaEntity<PerfilRequisicao> {
   private BigDecimal codPerfil;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private String imprescindivel;
   private BigDecimal nuRequisicao;
   private BigDecimal peso;

   public BigDecimal getCodPerfil() {
        return codPerfil;
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
        this.codPerfil = codPerfil;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getImprescindivel() {
        return imprescindivel;
   }

   public void setImprescindivel(String imprescindivel) {
        markAsChanged("IMPRESCINDIVEL", imprescindivel);
        this.imprescindivel = imprescindivel;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        markAsChanged("NUREQUISICAO", nuRequisicao);
        this.nuRequisicao = nuRequisicao;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
        this.peso = peso;
   }

   @Override
   public String getTableName() {
        return "TRSPER";
   }

   @Override
   public String getEntityName() {
        return "PerfilRequisicao";
   }

   @Override
   public PerfilRequisicao fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codPerfil = vo.asBigDecimal("CODPERFIL");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.imprescindivel = vo.asString("IMPRESCINDIVEL");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.peso = vo.asBigDecimal("PESO");
        return this;
   }
}
