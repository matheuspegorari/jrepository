package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PesagemMultipla extends AbstractSankhyaEntity<PesagemMultipla> {
   private BigDecimal balancaPb;
   private BigDecimal balancaTara;
   private BigDecimal codPort;
   private BigDecimal codUf;
   private BigDecimal codUsuPb;
   private BigDecimal codUsuTara;
   private Timestamp dhPesoBruto;
   private Timestamp dhTara;
   private String motorista;
   private BigDecimal numPesagem;
   private BigDecimal nuNota;
   private String observacao;
   private String pesagemManual;
   private BigDecimal pesoBruto;
   private BigDecimal pesoCorrigido;
   private BigDecimal pesoDesconto;
   private BigDecimal pesoLiq;
   private String placa;
   private String status;
   private BigDecimal tara;
   private String tipo;
   private String nmBalPesBruto;
   private String nmBalTara;
   private String nomeBalanca;
   private BigDecimal codEmp;
   private BigDecimal numPort;
   private BigDecimal codMoto;
   private BigDecimal codVeic;
   private String nomeUsuPb;
   private String nomeUsuTara;
   private BigDecimal retencoes;
   private BigDecimal codUsuCancel;
   private Timestamp dhCancel;
   private String nomeUsuCancel;
   private String modalidade;
   private String motivoCancel;

   public BigDecimal getBalancaPb() {
        return balancaPb;
   }

   public void setBalancaPb(BigDecimal balancaPb) {
        markAsChanged("BALANCAPB", balancaPb);
        this.balancaPb = balancaPb;
   }

   public BigDecimal getBalancaTara() {
        return balancaTara;
   }

   public void setBalancaTara(BigDecimal balancaTara) {
        markAsChanged("BALANCATARA", balancaTara);
        this.balancaTara = balancaTara;
   }

   public BigDecimal getCodPort() {
        return codPort;
   }

   public void setCodPort(BigDecimal codPort) {
        markAsChanged("CODPORT", codPort);
        this.codPort = codPort;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public BigDecimal getCodUsuPb() {
        return codUsuPb;
   }

   public void setCodUsuPb(BigDecimal codUsuPb) {
        markAsChanged("CODUSUPB", codUsuPb);
        this.codUsuPb = codUsuPb;
   }

   public BigDecimal getCodUsuTara() {
        return codUsuTara;
   }

   public void setCodUsuTara(BigDecimal codUsuTara) {
        markAsChanged("CODUSUTARA", codUsuTara);
        this.codUsuTara = codUsuTara;
   }

   public Timestamp getDhPesoBruto() {
        return dhPesoBruto;
   }

   public void setDhPesoBruto(Timestamp dhPesoBruto) {
        markAsChanged("DHPESOBRUTO", dhPesoBruto);
        this.dhPesoBruto = dhPesoBruto;
   }

   public Timestamp getDhTara() {
        return dhTara;
   }

   public void setDhTara(Timestamp dhTara) {
        markAsChanged("DHTARA", dhTara);
        this.dhTara = dhTara;
   }

   public String getMotorista() {
        return motorista;
   }

   public void setMotorista(String motorista) {
        markAsChanged("MOTORISTA", motorista);
        this.motorista = motorista;
   }

   public BigDecimal getNumPesagem() {
        return numPesagem;
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
        this.numPesagem = numPesagem;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getPesagemManual() {
        return pesagemManual;
   }

   public void setPesagemManual(String pesagemManual) {
        markAsChanged("PESAGEMMANUAL", pesagemManual);
        this.pesagemManual = pesagemManual;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoCorrigido() {
        return pesoCorrigido;
   }

   public void setPesoCorrigido(BigDecimal pesoCorrigido) {
        markAsChanged("PESOCORRIGIDO", pesoCorrigido);
        this.pesoCorrigido = pesoCorrigido;
   }

   public BigDecimal getPesoDesconto() {
        return pesoDesconto;
   }

   public void setPesoDesconto(BigDecimal pesoDesconto) {
        markAsChanged("PESODESCONTO", pesoDesconto);
        this.pesoDesconto = pesoDesconto;
   }

   public BigDecimal getPesoLiq() {
        return pesoLiq;
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
        this.pesoLiq = pesoLiq;
   }

   public String getPlaca() {
        return placa;
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
        this.placa = placa;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getTara() {
        return tara;
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
        this.tara = tara;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public String getNmBalPesBruto() {
        return nmBalPesBruto;
   }

   public void setNmBalPesBruto(String nmBalPesBruto) {
        markAsChanged("NMBALPESBRUTO", nmBalPesBruto);
        this.nmBalPesBruto = nmBalPesBruto;
   }

   public String getNmBalTara() {
        return nmBalTara;
   }

   public void setNmBalTara(String nmBalTara) {
        markAsChanged("NMBALTARA", nmBalTara);
        this.nmBalTara = nmBalTara;
   }

   public String getNomeBalanca() {
        return nomeBalanca;
   }

   public void setNomeBalanca(String nomeBalanca) {
        markAsChanged("NOMEBALANCA", nomeBalanca);
        this.nomeBalanca = nomeBalanca;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getNumPort() {
        return numPort;
   }

   public void setNumPort(BigDecimal numPort) {
        markAsChanged("NUMPORT", numPort);
        this.numPort = numPort;
   }

   public BigDecimal getCodMoto() {
        return codMoto;
   }

   public void setCodMoto(BigDecimal codMoto) {
        markAsChanged("CODMOTO", codMoto);
        this.codMoto = codMoto;
   }

   public BigDecimal getCodVeic() {
        return codVeic;
   }

   public void setCodVeic(BigDecimal codVeic) {
        markAsChanged("CODVEIC", codVeic);
        this.codVeic = codVeic;
   }

   public String getNomeUsuPb() {
        return nomeUsuPb;
   }

   public void setNomeUsuPb(String nomeUsuPb) {
        markAsChanged("NOMEUSUPB", nomeUsuPb);
        this.nomeUsuPb = nomeUsuPb;
   }

   public String getNomeUsuTara() {
        return nomeUsuTara;
   }

   public void setNomeUsuTara(String nomeUsuTara) {
        markAsChanged("NOMEUSUTARA", nomeUsuTara);
        this.nomeUsuTara = nomeUsuTara;
   }

   public BigDecimal getRetencoes() {
        return retencoes;
   }

   public void setRetencoes(BigDecimal retencoes) {
        markAsChanged("RETENCOES", retencoes);
        this.retencoes = retencoes;
   }

   public BigDecimal getCodUsuCancel() {
        return codUsuCancel;
   }

   public void setCodUsuCancel(BigDecimal codUsuCancel) {
        markAsChanged("CODUSUCANCEL", codUsuCancel);
        this.codUsuCancel = codUsuCancel;
   }

   public Timestamp getDhCancel() {
        return dhCancel;
   }

   public void setDhCancel(Timestamp dhCancel) {
        markAsChanged("DHCANCEL", dhCancel);
        this.dhCancel = dhCancel;
   }

   public String getNomeUsuCancel() {
        return nomeUsuCancel;
   }

   public void setNomeUsuCancel(String nomeUsuCancel) {
        markAsChanged("NOMEUSUCANCEL", nomeUsuCancel);
        this.nomeUsuCancel = nomeUsuCancel;
   }

   public String getModalidade() {
        return modalidade;
   }

   public void setModalidade(String modalidade) {
        markAsChanged("MODALIDADE", modalidade);
        this.modalidade = modalidade;
   }

   public String getMotivoCancel() {
        return motivoCancel;
   }

   public void setMotivoCancel(String motivoCancel) {
        markAsChanged("MOTIVOCANCEL", motivoCancel);
        this.motivoCancel = motivoCancel;
   }

   @Override
   public String getTableName() {
        return "TGAPES";
   }

   @Override
   public String getEntityName() {
        return "PesagemMultipla";
   }

   @Override
   public PesagemMultipla fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.balancaPb = vo.asBigDecimal("BALANCAPB");
        this.balancaTara = vo.asBigDecimal("BALANCATARA");
        this.codPort = vo.asBigDecimal("CODPORT");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codUsuPb = vo.asBigDecimal("CODUSUPB");
        this.codUsuTara = vo.asBigDecimal("CODUSUTARA");
        this.dhPesoBruto = vo.asTimestamp("DHPESOBRUTO");
        this.dhTara = vo.asTimestamp("DHTARA");
        this.motorista = vo.asString("MOTORISTA");
        this.numPesagem = vo.asBigDecimal("NUMPESAGEM");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.observacao = vo.asString("OBSERVACAO");
        this.pesagemManual = vo.asString("PESAGEMMANUAL");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoCorrigido = vo.asBigDecimal("PESOCORRIGIDO");
        this.pesoDesconto = vo.asBigDecimal("PESODESCONTO");
        this.pesoLiq = vo.asBigDecimal("PESOLIQ");
        this.placa = vo.asString("PLACA");
        this.status = vo.asString("STATUS");
        this.tara = vo.asBigDecimal("TARA");
        this.tipo = vo.asString("TIPO");
        this.nmBalPesBruto = vo.asString("NMBALPESBRUTO");
        this.nmBalTara = vo.asString("NMBALTARA");
        this.nomeBalanca = vo.asString("NOMEBALANCA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.numPort = vo.asBigDecimal("NUMPORT");
        this.codMoto = vo.asBigDecimal("CODMOTO");
        this.codVeic = vo.asBigDecimal("CODVEIC");
        this.nomeUsuPb = vo.asString("NOMEUSUPB");
        this.nomeUsuTara = vo.asString("NOMEUSUTARA");
        this.retencoes = vo.asBigDecimal("RETENCOES");
        this.codUsuCancel = vo.asBigDecimal("CODUSUCANCEL");
        this.dhCancel = vo.asTimestamp("DHCANCEL");
        this.nomeUsuCancel = vo.asString("NOMEUSUCANCEL");
        this.modalidade = vo.asString("MODALIDADE");
        this.motivoCancel = vo.asString("MOTIVOCANCEL");
        return this;
   }
}
