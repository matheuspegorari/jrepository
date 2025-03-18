package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CompartilhamentoProcesso extends AbstractSankhyaEntity<CompartilhamentoProcesso> {
   private BigDecimal codPrn;
   private BigDecimal codUsu;
   private String permiteCompartilhar;
   private String permiteEdicao;
   private String permiteIniciar;
   private BigDecimal sequencia;
   private String tipUsuGru;

   public BigDecimal getCodPrn() {
        return codPrn;
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
        this.codPrn = codPrn;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getPermiteCompartilhar() {
        return permiteCompartilhar;
   }

   public void setPermiteCompartilhar(String permiteCompartilhar) {
        markAsChanged("PERMITECOMPARTILHAR", permiteCompartilhar);
        this.permiteCompartilhar = permiteCompartilhar;
   }

   public String getPermiteEdicao() {
        return permiteEdicao;
   }

   public void setPermiteEdicao(String permiteEdicao) {
        markAsChanged("PERMITEEDICAO", permiteEdicao);
        this.permiteEdicao = permiteEdicao;
   }

   public String getPermiteIniciar() {
        return permiteIniciar;
   }

   public void setPermiteIniciar(String permiteIniciar) {
        markAsChanged("PERMITEINICIAR", permiteIniciar);
        this.permiteIniciar = permiteIniciar;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTipUsuGru() {
        return tipUsuGru;
   }

   public void setTipUsuGru(String tipUsuGru) {
        markAsChanged("TIPUSUGRU", tipUsuGru);
        this.tipUsuGru = tipUsuGru;
   }

   @Override
   public String getTableName() {
        return "TWFCPN";
   }

   @Override
   public String getEntityName() {
        return "CompartilhamentoProcesso";
   }

   @Override
   public CompartilhamentoProcesso fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codPrn = vo.asBigDecimal("CODPRN");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.permiteCompartilhar = vo.asString("PERMITECOMPARTILHAR");
        this.permiteEdicao = vo.asString("PERMITEEDICAO");
        this.permiteIniciar = vo.asString("PERMITEINICIAR");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipUsuGru = vo.asString("TIPUSUGRU");
        return this;
   }
}
